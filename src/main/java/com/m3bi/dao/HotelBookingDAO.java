package com.m3bi.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m3bi.model.HotelBooking;

public interface HotelBookingDAO extends JpaRepository<HotelBooking, Integer> {
	public HotelBooking findByHotelIdAndBookingDateAndUserIdAndHotelRoomType(int hotelId, Date bookingDate, int userId, String hotelRoomType);
//	public HotelRoomBooking findByHotelIdAndBookingDateAndBookingStatusAndHotelRoomType(int hotelId, Date bookingDate, String bookingStatus, String hotelRoomType);
//	public HotelRoomBooking findByHotelIdAndBookingDateAndBookingStatusAndHotelRoomId(int hotelId, Date bookingDate, String bookingStatus, int hotelRoomId);
//	public List<HotelRoomBooking> findByHotelIdAndBookingDateAndBookingStatusAndHotelRoomType(int hotelId, Date bookingDate, String bookingStatus, String hotelRoomType);
	public List<HotelBooking> findByHotelIdAndBookingDateAndHotelRoomType(int hotelId, Date bookingDate, String hotelRoomType);
	public List<HotelBooking> findByHotelId(int hotelId);
	public List<HotelBooking> findByUserIdAndBookingStatus(int userId, String bookingStatus);
}
