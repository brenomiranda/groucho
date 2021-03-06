/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package it.cnr.iasi.saks.groucho.lsh.rest.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-02T22:49:41.406+02:00")

@Api(value = "mark", description = "the mark API")
public interface MarkApi {

    @ApiOperation(value = "Assert that a given state has been observed.", nickname = "markState", notes = "Assert that a given state has been observed. It return TRUE is the state has been marked, FALSE otherwise.", tags={ "markState", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation."),
        @ApiResponse(code = 400, message = "Invalid State Supplied."),
        @ApiResponse(code = 404, message = "Mark Exception.") })
    @RequestMapping(value = "/mark",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> markState(@ApiParam(value = "The Actual Internal Representation as a String of the Considered State." ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "Assert that a given state has been observed.", nickname = "markStateLSH", notes = "Assert that a given state has been observed. It return TRUE is the state has been marked, FALSE otherwise. The input parameter is supposed to be a codification in LSH of the actual internal state representation.", tags={ "markState", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation."),
        @ApiResponse(code = 400, message = "Invalid LSH State Supplied."),
        @ApiResponse(code = 404, message = "Mark Exception.") })
    @RequestMapping(value = "/mark/{stateStringLSH}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> markStateLSH(@ApiParam(value = "LSH String of Considered State",required=true) @PathVariable("stateStringLSH") String stateStringLSH);

}
