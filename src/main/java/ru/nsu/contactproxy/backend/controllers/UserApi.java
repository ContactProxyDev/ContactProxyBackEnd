package ru.nsu.contactproxy.backend.controllers;

import ru.nsu.contactproxy.backend.dto.ErrorDTO;
import ru.nsu.contactproxy.backend.dto.PermissionRequestDTO;
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
import ru.nsu.contactproxy.backend.util.ApiUtil;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Validated
@Tag(name = "User", description = "the user API")
@RequestMapping("${openapi.contactProxy.base-path:/contact-proxy}")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user/notifications/{request_id} : Method to answer current notifications
     *
     * @param requestId RequestEntity ID (required)
     * @param permissionRequestDTO  (required)
     * @return Successful response (status code 200)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "answerOnNotification",
        summary = "Method to answer current notifications",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/notifications/{request_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> answerOnNotification(
        @Parameter(name = "request_id", description = "RequestEntity ID", required = true) @PathVariable("request_id") Integer requestId,
        @Parameter(name = "PermissionRequestDTO", description = "", required = true) @Valid @RequestBody PermissionRequestDTO permissionRequestDTO
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/notifications/{user_id} : Method to get current user's all notifications
     *
     * @param userId UserEntity ID (required)
     * @return Successful response with user's all notifications (status code 200)
     *         or Current user doesn't have any notifications (status code 204)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getUsersNotifications",
        summary = "Method to get current user's all notifications",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with user's all notifications", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PermissionRequestDTO.class))
            }),
            @ApiResponse(responseCode = "204", description = "Current user doesn't have any notifications"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/notifications/{user_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<PermissionRequestDTO>> getUsersNotifications(
        @Parameter(name = "user_id", description = "UserEntity ID", required = true) @PathVariable("user_id") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestingUser\" : { \"surname\" : \"Ivanov\", \"name\" : \"Ivan\", \"id\" : 123, \"url\" : \"id123\" }, \"requestedCardId\" : 12, \"requestState\" : \"accept\", \"requestDate\" : \"2021-01-30T08:30:00Z\", \"id\" : 1234 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
