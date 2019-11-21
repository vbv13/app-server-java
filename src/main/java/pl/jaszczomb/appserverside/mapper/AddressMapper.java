package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.collection.embedded.Address;
import pl.jaszczomb.appserverside.dto.embedded.AddressDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressMapper {

    public AddressDto mapToAddressDto(Address address) {
        return new AddressDto(address.getRecipientName(), address.getLine1(), address.getLine2(),
                address.getCity(), address.getState(), address.getPostalCode(), address.getCountryCode());
    }

    public Address mapToAddress(AddressDto addressDto) {
        return new Address(addressDto.getRecipientName(), addressDto.getLine1(), addressDto.getLine2(),
                addressDto.getCity(), addressDto.getState(), addressDto.getPostalCode(), addressDto.getCountryCode());
    }


    public List<AddressDto> mapToAddressDtoList(List<Address> addresses) {
        return addresses.stream()
                .map(this::mapToAddressDto)
                .collect(Collectors.toList());
    }
}
