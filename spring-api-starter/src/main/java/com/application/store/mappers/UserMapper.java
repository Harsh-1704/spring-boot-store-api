package com.application.store.mappers;

import com.application.store.DTO.UserDto;
import com.application.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
