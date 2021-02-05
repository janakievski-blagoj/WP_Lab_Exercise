package mk.finki.ukim.wp.balloonShop.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShoppingCartExp extends RuntimeException{
    public ShoppingCartExp(Long id) {
        super(String.format("Shopping cart with id: %d not found!", id));
    }
}
