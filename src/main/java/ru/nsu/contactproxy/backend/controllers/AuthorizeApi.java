package ru.nsu.contactproxy.backend.controllers;

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
import ru.nsu.contactproxy.backend.dto.*;
import ru.nsu.contactproxy.backend.util.ApiUtil;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Tag(name = "authorize", description = "the authorize API")
@RequestMapping("${openapi.contactProxy.base-path:/contact-proxy}")
public interface AuthorizeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /authorize/changePassword/{user_id} : Method to refresh user's password
     *
     * @param userId UserEntity ID (required)
     * @param userChangePasswordRequestDTO  (required)
     * @return UserEntity successfully refreshed password (status code 200)
     *         or This password is already using (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "changePassword",
        summary = "Method to refresh user's password",
        tags = { "authorize" },
        responses = {
            @ApiResponse(responseCode = "200", description = "UserEntity successfully refreshed password", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JWTResponseDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "This password is already using"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/changePassword/{user_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<JWTResponseDTO> changePassword(
        @Parameter(name = "user_id", description = "UserEntity ID", required = true) @PathVariable("user_id") Integer userId,
        @Parameter(name = "UserChangePasswordRequestDTO", description = "", required = true) @Valid @RequestBody UserChangePasswordRequestDTO userChangePasswordRequestDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : { \"name\" : \"Admin\", \"id\" : 123 }, \"jwt\" : \"ab1cd2e.f3gh4ij5k.l6mn7op8\", \"user\" : { \"surname\" : \"Ivanov\", \"name\" : \"Ivan\", \"id\" : 123, \"url\" : \"id123\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /authorize/forgotPassword : Method to refresh user's password
     *
     * @param userRestorePasswordRequestDTO  (required)
     * @return UserEntity successfully refreshed password (status code 200)
     *         or This password is already using (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "forgotPassword",
        summary = "Method to refresh user's password",
        tags = { "authorize" },
        responses = {
            @ApiResponse(responseCode = "200", description = "UserEntity successfully refreshed password"),
            @ApiResponse(responseCode = "400", description = "This password is already using"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/forgotPassword",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> forgotPassword(
        @Parameter(name = "UserRestorePasswordRequestDTO", description = "", required = true) @Valid @RequestBody UserRestorePasswordRequestDTO userRestorePasswordRequestDTO
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /authorize/login : Method to log in
     *
     * @param userLoginRequestDTO  (required)
     * @return Successful log in (status code 200)
     *         or No such user found (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "login",
        summary = "Method to log in",
        tags = { "authorize" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful log in", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JWTResponseDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "No such user found"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<JWTResponseDTO> login(
        @Parameter(name = "UserLoginRequestDTO", description = "", required = true) @Valid @RequestBody UserLoginRequestDTO userLoginRequestDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : { \"name\" : \"Admin\", \"id\" : 123 }, \"jwt\" : \"ab1cd2e.f3gh4ij5k.l6mn7op8\", \"user\" : { \"surname\" : \"Ivanov\", \"name\" : \"Ivan\", \"id\" : 123, \"url\" : \"id123\" } }";
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
     * @param userRegisterRequestDTO  (required)
     * @return Successful register (status code 200)
     *         or This email has already been registered (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "register",
        summary = "Method to register user",
        tags = { "authorize" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful register", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JWTResponseDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "This email has already been registered"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/authorize/register",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<JWTResponseDTO> register(
        @Parameter(name = "UserRegisterRequestDTO", description = "", required = true) @Valid @RequestBody UserRegisterRequestDTO userRegisterRequestDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : { \"name\" : \"Admin\", \"id\" : 123 }, \"jwt\" : \"ab1cd2e.f3gh4ij5k.l6mn7op8\", \"user\" : { \"surname\" : \"Ivanov\", \"name\" : \"Ivan\", \"id\" : 123, \"url\" : \"id123\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
