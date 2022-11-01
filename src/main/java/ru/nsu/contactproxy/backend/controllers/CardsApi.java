package ru.nsu.contactproxy.backend.controllers;

import ru.nsu.contactproxy.backend.dto.CardDTO;
import ru.nsu.contactproxy.backend.dto.ErrorDTO;
import ru.nsu.contactproxy.backend.dto.RequestedCardDTO;
import ru.nsu.contactproxy.backend.dto.UserDTO;
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
@Tag(name = "UserCards", description = "the cards API")
@RequestMapping("${openapi.contactProxy.base-path:/contact-proxy}")
public interface CardsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /cards/create : Method to create new card
     *
     * @param cardDTO  (required)
     * @return Successful card creation (status code 200)
     *         or When something goes wrong (status code 500)
     */
    @Operation(
        operationId = "createCard",
        summary = "Method to create new card",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful card creation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "500", description = "When something goes wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/cards/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CardDTO> createCard(
        @Parameter(name = "CardDTO", description = "", required = true) @Valid @RequestBody CardDTO cardDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /cards/{card_id}/delete : Method to delete card
     *
     * @param cardId CardEntity id (required)
     * @return Successful delete (status code 200)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "deleteById",
        summary = "Method to delete card",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful delete"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/cards/{card_id}/delete",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteById(
        @Parameter(name = "card_id", description = "CardEntity id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /cards/{card_id}/edit : Method to edit card
     *
     * @param cardId CardEntity id (required)
     * @return Successful editing card (status code 200)
     *         or CardEntity with this id doesn't exist (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "editById",
        summary = "Method to edit card",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful editing card", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "CardEntity with this id doesn't exist"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/cards/{card_id}/edit",
        produces = { "application/json" }
    )
    default ResponseEntity<CardDTO> editById(
        @Parameter(name = "card_id", description = "CardEntity id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cards/{card_id} : Method to get card by id
     *
     * @param cardId CardEntity ID (required)
     * @return Successful response with user's card (status code 200)
     *         or Successful response but asking for register and/or requesting premission (status code 204)
     *         or CardEntity with this id doesn't exist (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getCardById",
        summary = "Method to get card by id",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with user's card", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "204", description = "Successful response but asking for register and/or requesting premission", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RequestedCardDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "CardEntity with this id doesn't exist"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/{card_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<CardDTO> getCardById(
        @Parameter(name = "card_id", description = "CardEntity ID", required = true) @PathVariable("card_id") Integer cardId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cards/viewers/{card_id} : Method to get card view history by card id
     *
     * @param cardId CardEntity ID (required)
     * @return Successful response with user's card (status code 200)
     *         or CardEntity with this id doesn't exist (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getCardViewHistoryById",
        summary = "Method to get card view history by card id",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with user's card", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "CardEntity with this id doesn't exist"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/viewers/{card_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<UserDTO>> getCardViewHistoryById(
        @Parameter(name = "card_id", description = "CardEntity ID", required = true) @PathVariable("card_id") Integer cardId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"Ivanov\", \"name\" : \"Ivan\", \"id\" : 123, \"url\" : \"id123\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cards/all/{user_id} : Method to get current user's all cards
     *
     * @param userId UserEntity ID (required)
     * @return Successful response with users all cards (status code 200)
     *         or Current user doesn't have any cards (status code 204)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getUsersCards",
        summary = "Method to get current user's all cards",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with users all cards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "204", description = "Current user doesn't have any cards"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/all/{user_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<CardDTO>> getUsersCards(
        @Parameter(name = "user_id", description = "UserEntity ID", required = true) @PathVariable("user_id") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cards/viewed/{user_id} : Method to get current user's history of views
     *
     * @param userId UserEntity ID (required)
     * @return Successful response with users all cards (status code 200)
     *         or Current user doesn't have any cards (status code 204)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getUsersHistoryOfViews",
        summary = "Method to get current user's history of views",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with users all cards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "204", description = "Current user doesn't have any cards"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/viewed/{user_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<CardDTO>> getUsersHistoryOfViews(
        @Parameter(name = "user_id", description = "UserEntity ID", required = true) @PathVariable("user_id") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cards/saved/{user_id} : Method to get current user's saved cards
     *
     * @param userId UserEntity ID (required)
     * @return Successful response with users all cards (status code 200)
     *         or Current user doesn't have any cards (status code 204)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getUsersSavedCards",
        summary = "Method to get current user's saved cards",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with users all cards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "204", description = "Current user doesn't have any cards"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/saved/{user_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<CardDTO>> getUsersSavedCards(
        @Parameter(name = "user_id", description = "UserEntity ID", required = true) @PathVariable("user_id") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"MyCard\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"cardFields\" : [ { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 }, { \"fieldName\" : \"email\", \"fieldData\" : \"example@email.com\", \"cardId\" : 12, \"cardFieldType\" : { \"template\" : \"specific-template\", \"name\" : \"field-name\", \"id\" : 123, \"isCopyable\" : true }, \"id\" : 12 } ], \"maxViewCount\" : 15, \"url\" : \"MyCardURL\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /cards/{card_id}/save : Method to save card of another user
     *
     * @param cardId CardEntity id (required)
     * @return Successful save (status code 200)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "saveById",
        summary = "Method to save card of another user",
        tags = { "UserCards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful save"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/cards/{card_id}/save",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> saveById(
        @Parameter(name = "card_id", description = "CardEntity id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
