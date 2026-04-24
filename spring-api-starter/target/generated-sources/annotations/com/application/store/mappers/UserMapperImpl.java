package com.application.store.mappers;

import com.application.store.DTO.UserDto;
import com.application.store.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-25T00:49:26+0530",
    comments = "version: 1.6.2, compiler: javac, environment: Java 25.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        Long id = null;
        String email = null;

        id = user.getId();
        email = user.getEmail();

        String name = null;

        UserDto userDto = new UserDto( id, name, email );

        return userDto;
    }
}
