import AddressBook.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    BuddyInfo b1, b2;

    @Before
    public void setUp() throws Exception {
        b1 = new BuddyInfo("name1","phone1");
        b2 = new BuddyInfo("name2", "phone2");
    }

    @Test
    public void get_test() throws Exception {
        assertEquals("name1",b1.getName());
        assertEquals("phone1",b1.getPhone());
    }

    @Test
    public void set_test() throws Exception {
        b1.setName("testname");
        b1.setPhone("testphone");
        assertEquals("testname",b1.getName());
        assertEquals("testphone",b1.getPhone());
    }

    @Test
    public void bicreate_test() throws Exception {
        BuddyInfo bt = new BuddyInfo(b1.getName(),b1.getPhone());
        assertEquals(b1.toString(),bt.toString());
    }
}