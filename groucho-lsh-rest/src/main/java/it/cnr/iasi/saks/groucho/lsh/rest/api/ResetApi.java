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

@Api(value = "reset", description = "the reset API")
public interface ResetApi {

    @ApiOperation(value = "Suggest to Restore the State of the Observer to the Default Configurations.", nickname = "resetStateObserver", notes = "Suggest to Restore the State of the Observer to the Default Configurations. It is only a suggestion, there is no commitment from the receiver.", tags={ "resetStateObserver", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation."),
        @ApiResponse(code = 400, message = "Reset Not Allowed."),
        @ApiResponse(code = 404, message = "Reset Exception.") })
    @RequestMapping(value = "/reset",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> resetStateObserver();

}
