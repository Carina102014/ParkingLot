package com.parking.parkinglot.ejb;
import com.parking.parkinglot.Cars;
import com.parking.parkinglot.common.CarDto;
import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.entities.Car;
import com.parking.parkinglot.entities.User;
import jakarta.ejb.EJBException;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class UsersBean {
    private static final Logger LOG = Logger.getLogger(UsersBean.class.getName());
    @PersistenceContext
    EntityManager entityManager;
    private List<UserDto> copyUsersToDto(List<User> users) {

        List<UserDto> dtos = new ArrayList<>();
        for (User user   : users) {
            UserDto userDto=new UserDto( user.getUsername(),
                    user.getEmail(),
                    user.getPassword(),
                    user.getId());
            dtos.add(userDto);
        }
        return dtos;
    }

    public List<UserDto> findAllUsers(){
        LOG.info("findAllUsers");
        try{
            TypedQuery<User> typedQuery = entityManager.createQuery("SELECT c FROM User c", User.class);
            List<User> users = typedQuery.getResultList();
            return copyUsersToDto(users);
        }
        catch(Exception ex){
            throw new EJBException(ex);
        }
    }



}