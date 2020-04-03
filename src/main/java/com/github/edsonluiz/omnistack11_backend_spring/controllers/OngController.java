package com.github.edsonluiz.omnistack11_backend_spring.controllers;

import com.github.edsonluiz.omnistack11_backend_spring.models.entities.Ong;
import com.github.edsonluiz.omnistack11_backend_spring.models.services.OngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ongs")
public class OngController {

  @Autowired
  private OngService ongService;

  @GetMapping()
  public List<Ong> index() {
    return ongService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> show(@PathVariable Long id) {
    return new ResponseEntity<Ong>(ongService.findById(id), HttpStatus.OK);
  }

  @PostMapping()
  public ResponseEntity<?> store(@Validated @RequestBody Ong ong) {
    Ong operationResult = ongService.save(ong);
    Map<String, String> json = new HashMap<>();
    json.put("ong_id", operationResult.getOng_id());
    return new ResponseEntity<>(json, HttpStatus.CREATED);
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Map<String, String> handleValidationExceptions(
      MethodArgumentNotValidException ex) {
    Map<String, String> errors = new HashMap<>();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = error.getDefaultMessage();
      errors.put(fieldName, errorMessage);
    });
    return errors;
  }
}
