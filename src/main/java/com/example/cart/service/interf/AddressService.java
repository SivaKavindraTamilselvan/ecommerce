package com.example.cart.service.interf;

import com.example.cart.dto.AddressDto;
import com.example.cart.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
