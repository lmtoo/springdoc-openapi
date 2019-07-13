/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.springdoc.sample2;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-08T09:37:36.546Z[GMT]")
@Tag(name = "inventory")
public interface InventoryApi {

	@Operation(description = "adds an inventory item", operationId = "addInventory", summary = "Adds an item to the system", tags = {
			"admins", })
    @ApiResponses(value = { 
			@ApiResponse(responseCode = "201", description = "item created"),
			@ApiResponse(responseCode = "400", description = "invalid input, object invalid"),
			@ApiResponse(responseCode = "409", description = "an existing item already exists") })
    @RequestMapping(value = "/inventory",
        consumes = { "application/json" },
        method = RequestMethod.POST)
	ResponseEntity<Void> addInventory(
			@Parameter(name = "Inventory item to add") @Valid @RequestBody InventoryItem body);


	@Operation(description = "searches inventory", operationId = "searchInventory", summary = "By passing in the appropriate options, you can search for available inventory in the system ", tags = {
			"developers", })
    @ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "search results matching criteria"),
			@ApiResponse(responseCode = "400", description = "bad input parameter") })
    @RequestMapping(value = "/inventory",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
	ResponseEntity<List<InventoryItem>> searchInventory(
			@Parameter(description = "pass an optional search string for looking up inventory") @Valid @RequestParam(value = "searchString", required = false) String searchString,
			@Min(0) @Parameter(name = "number of records to skip for pagination") @Valid @RequestParam(value = "skip", required = true) Integer skip,
			@Min(0) @Max(50) @Parameter(name = "maximum number of records to return") @Valid @RequestParam(value = "limit", required = true) Integer limit);

}
