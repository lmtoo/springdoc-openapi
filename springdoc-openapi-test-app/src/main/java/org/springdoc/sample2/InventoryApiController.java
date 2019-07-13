package org.springdoc.sample2;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-08T09:37:36.546Z[GMT]")
@RestController
public class InventoryApiController implements InventoryApi {

    private static final Logger log = LoggerFactory.getLogger(InventoryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InventoryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	public ResponseEntity<Void> addInventory(
			@Parameter(name = "Inventory item to add") @Valid @RequestBody InventoryItem body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

	public ResponseEntity<List<InventoryItem>> searchInventory(
			@Parameter(name = "pass an optional search string for looking up inventory") @Valid @RequestParam(value = "searchString", required = false) String searchString,
			@Min(0) @Parameter(name = "number of records to skip for pagination") @Valid @RequestParam(value = "skip", required = true) Integer skip,
			@Min(0) @Max(50) @Parameter(name = "maximum number of records to return") @Valid @RequestParam(value = "limit", required = true) Integer limit) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<InventoryItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
