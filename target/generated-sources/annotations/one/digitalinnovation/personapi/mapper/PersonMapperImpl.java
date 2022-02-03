package one.digitalinnovation.personapi.mapper;

import javax.annotation.processing.Generated;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-02T22:39:17-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (International Business Machines Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        return personDTO;
    }
}
