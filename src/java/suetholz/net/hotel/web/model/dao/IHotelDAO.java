/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suetholz.net.hotel.web.model.dao;

import java.sql.SQLException;
import java.util.List;
import suetholz.net.hotel.web.model.entities.Hotel;

/**
 *
 * @author wsuetholz
 */
public interface IHotelDAO {

    List<Hotel> getAllHotels() throws ClassNotFoundException, SQLException;
    
    Hotel getHotelByName (String hotelName) throws ClassNotFoundException, SQLException ;

    Hotel getHotelById (long hotelId) throws ClassNotFoundException, SQLException ;

    long updateHotel (Hotel hotel) throws ClassNotFoundException, SQLException;
    
    long deleteHotel (Hotel hotel) throws ClassNotFoundException, SQLException;
    
    long insertHotel (Hotel hotel) throws ClassNotFoundException, SQLException;
    
}
