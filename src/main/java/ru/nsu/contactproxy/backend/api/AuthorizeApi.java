package ru.nsu.contactproxy.backend.api;

import ru.nsu.contactproxy.backend.model.Error;
import ru.nsu.contactproxy.backend.model.JWTResponse;
import ru.nsu.contactproxy.backend.model.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
@Validated
@Tag(name = "authorize", description = "the authorize API")
@RequestMapping("${openapi.contactProxy.base-path:/contact-proxy}")
public interface AuthorizeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /authorize/forgotPassword : Method to refresh user&#39;s password
     *
     * @return User successfully refreshed password (status code 200)
     *         or This password is already using (status code 400)
     *         or When something went wrong (status code 200)
     */
    @Operation(
        operationId = "forgotPassword",
        summary = "Method to refresh user's password",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User successfully refreshed password"),
            @ApiResponse(responseCode = "400", description = "This password is already using"),
            @ApiResponse(responseCode = "200", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/forgotPassword",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> forgotPassword(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /authorize/login : Method to log in
     *
     * @return Successful log in (status code 200)
     *         or No such user found (status code 400)
     *         or When something went wrong (status code 200)
     */
    @Operation(
        operationId = "login",
        summary = "Method to log in",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful log in", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JWTResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "No such user found"),
            @ApiResponse(responseCode = "200", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/login",
        produces = { "application/json" }
    )
    default ResponseEntity<JWTResponse> login(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"jwt\" : \"ab1cd2e.f3gh4ij5k.l6mn7op8\", \"userId\" : 123 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /authorize/register : Method to register user
     *
     * @param userDTO  (required)
     * @return Successful register (status code 200)
     *         or This email has already been registered (status code 400)
     *         or When something went wrong (status code 200)
     */
    @Operation(
        operationId = "register",
        summary = "Method to register user",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful register", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JWTResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "This email has already been registered"),
            @ApiResponse(responseCode = "200", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/register",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<JWTResponse> register(
        @Parameter(name = "UserDTO", description = "", required = true) @Valid @RequestBody UserDTO userDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"jwt\" : \"ab1cd2e.f3gh4ij5k.l6mn7op8\", \"userId\" : 123 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
