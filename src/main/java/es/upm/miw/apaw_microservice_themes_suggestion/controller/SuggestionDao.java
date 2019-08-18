package es.upm.miw.apaw_microservice_themes_suggestion.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuggestionDao extends MongoRepository<Suggestion, String> {
}
