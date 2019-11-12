package pl.jaszczomb.appserverside.mapper;

import org.springframework.stereotype.Component;
import pl.jaszczomb.appserverside.dto.AddressDto;
import pl.jaszczomb.appserverside.collection.Address;

@Component
public class AddressMapper {

    public AddressDto mapToAddressDto(Address address) {
        return new AddressDto();
    }

    public Address mapToAddress(AddressDto addressDto) {
        return new Address();
    }


}
