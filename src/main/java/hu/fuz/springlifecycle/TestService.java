package hu.fuz.springlifecycle;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final OtherTestService otherTestService;

    public TestService(OtherTestService otherTestService) {
        this.otherTestService = otherTestService;
    }
}
