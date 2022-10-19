package ru.nsu.contactproxy.backend.controllers;

import ru.nsu.contactproxy.backend.model.Card;
import ru.nsu.contactproxy.backend.model.Error;
import ru.nsu.contactproxy.backend.util.ApiUtil;
import ru.nsu.contactproxy.backend.model.CardDTO;
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
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
@Validated
@Tag(name = "Cards", description = "the cards API")
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
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful card creation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "500", description = "When something goes wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
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
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"isDeleted\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"card\", \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"maxViewCount\" : 15, \"cardFields\" : [ { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 }, { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 } ], \"url\" : \"krasivyi-url\" }";
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
     * @param cardId Card id (required)
     * @return Successful delete (status code 200)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "deleteById",
        summary = "Method to delete card",
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful delete"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/cards/{card_id}/delete",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteById(
        @Parameter(name = "card_id", description = "Card id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /cards/{card_id}/edit : Method to edit card
     *
     * @param cardId Card id (required)
     * @return Successful editing card (status code 200)
     *         or Card with this id doesn't exist (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "editById",
        summary = "Method to edit card",
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful editing card", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Card with this id doesn't exist"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/cards/{card_id}/edit",
        produces = { "application/json" }
    )
    default ResponseEntity<CardDTO> editById(
        @Parameter(name = "card_id", description = "Card id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"isDeleted\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"card\", \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"maxViewCount\" : 15, \"cardFields\" : [ { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 }, { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 } ], \"url\" : \"krasivyi-url\" }";
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
     * @param cardId Card ID (required)
     * @return Successful response with users all cards (status code 200)
     *         or Card with this id doesn't exist (status code 400)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getCardById",
        summary = "Method to get card by id",
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with users all cards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CardDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Card with this id doesn't exist"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/{card_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<CardDTO> getCardById(
        @Parameter(name = "card_id", description = "Card ID", required = true) @PathVariable("card_id") Integer cardId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"isDeleted\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"card\", \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"maxViewCount\" : 15, \"cardFields\" : [ { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 }, { \"fieldName\" : \"card field\", \"cardFieldTypeId\" : \"field type\", \"fieldData\" : \"I am data\", \"cardId\" : 12, \"id\" : 12 } ], \"url\" : \"krasivyi-url\" }";
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
     * @param userId User ID (required)
     * @return Successful response with users all cards (status code 200)
     *         or Current user doesn't have any cards (status code 204)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "getUsersCards",
        summary = "Method to get current user's all cards",
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response with users all cards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Card.class))
            }),
            @ApiResponse(responseCode = "204", description = "Current user doesn't have any cards"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cards/all/{user_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Card>> getUsersCards(
        @Parameter(name = "user_id", description = "User ID", required = true) @PathVariable("user_id") Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"viewCounter\" : 10, \"isOnlyWithPermission\" : true, \"isDeleted\" : true, \"maxViewDate\" : \"2021-01-31T08:30:00Z\", \"name\" : \"card\", \"id\" : 12, \"isVisible\" : true, \"isOnlyForAuthorizedUsers\" : true, \"ownerId\" : 123, \"creationDate\" : \"2021-01-30T08:30:00Z\", \"maxViewCount\" : 15, \"url\" : \"krasivyi-url\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /cards/{card_id}/save : Method to save card
     *
     * @param cardId Card id (required)
     * @return Successful save (status code 200)
     *         or When something went wrong (status code 500)
     */
    @Operation(
        operationId = "saveById",
        summary = "Method to save card",
        tags = { "Cards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful save"),
            @ApiResponse(responseCode = "500", description = "When something went wrong", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/cards/{card_id}/save",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> saveById(
        @Parameter(name = "card_id", description = "Card id", required = true) @PathVariable("card_id") Integer cardId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
