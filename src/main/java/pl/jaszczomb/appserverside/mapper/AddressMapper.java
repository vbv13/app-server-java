package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.AddressDto;
import pl.jaszczomb.appserverside.collection.embedded.Address;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressMapper {

    public AddressDto mapToAddressDto(Address address) {
        return new AddressDto();
    }

    public Address mapToAddress(AddressDto addressDto) {
        return new Address();
    }

    public List<AddressDto> mapToAddressDtoList(List<Address> addresses) {
        return addresses.stream()
                .map(this::mapToAddressDto)
                .collect(Collectors.toList());
    }
}
