package application.services;

import application.model.Field;
import application.repositories.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FieldService {

    @Autowired
    private FieldRepository fieldRepository;

    @Transactional
    public Optional<Field> getById(int id) {
        return fieldRepository.findById(id);
    }
}
