import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelReservationTest {

    @Test
    public void testAddHotel() {
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Hotel Orchid",4,150,100,80,60);

        assertEquals(1, reservationSystem.hotels.size());
        assertEquals("Hotel Orchid", reservationSystem.hotels.get(0).name);
        assertEquals(4,reservationSystem.hotels.get(0).rating);
    }
}
