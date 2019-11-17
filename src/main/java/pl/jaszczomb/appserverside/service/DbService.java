package pl.jaszczomb.appserverside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaszczomb.appserverside.collection.*;
import pl.jaszczomb.appserverside.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired private AddressRepository addressRepository;
    @Autowired private BrandRepository brandRepository;
    @Autowired private CartRepository cartRepository;
    @Autowired private DetailRepository detailRepository;
    @Autowired private HistoryRepository historyRepository;
    @Autowired private ImageRepository imageRepository;
    @Autowired private PaymentRepository paymentRepository;
    @Autowired private ProductOnPaymentRepository productOnPaymentRepository;
    //@Autowired private ProductRepository productRepository;
    @Autowired private SortRepository sortRepository;
    @Autowired private UserOnPaymentRepository userOnPaymentRepository;
    //@Autowired private UserRepository userRepository;
    /*
    public List<Address> getAddresses() { return addressRepository.findAll(); }

    public Optional<Address> getAddress(String recipient_name) { return addressRepository.findById(recipient_name); }   //?? look at MongoRepository there is not findById() at all

    public Address saveAddress(Address address) { return addressRepository.save(address); }
    */


}
