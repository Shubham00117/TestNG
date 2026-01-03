package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions_Practical {

    @Test
    void verify_Login_Page() {

        // 1️⃣ Check page title
        Assert.assertEquals("Login - OpenShop", "Login - OpenShop", "❌ Page title mismatch!");

        // 2️⃣ Check page URL
        Assert.assertEquals("https://openshop.in/login", "https://openshop.in/login", "❌ URL mismatch!");

        // 3️⃣ Verify user is redirected correctly (not wrong URL)
        Assert.assertNotEquals("https://openshop.in/login", "https://openshop.in/home", "❌ Wrong redirection!");

        // 4️⃣ Check logo is displayed (true condition)
        Assert.assertTrue(true, "❌ Logo not displayed!");
//        Assert.assertTrue(true);//put it into in condition block test case execute successfully set assert to true and execution continues

        // 5️⃣ Verify Sign In button is not disabled (false condition)
        Assert.assertFalse(false, "❌ Button should be enabled!");
//        Assert.fail();//execution is fail

        // 6️⃣ Check null object condition
        Assert.assertNull(null, "❌ Object is expected to be null!");

        // 7️⃣ Check not null object condition
        Assert.assertNotNull("OpenShopUser", "❌ Value should not be null!");

        // 8️⃣ Verify same object reference (in some frameworks)
        Assert.assertSame("Welcome", "Welcome", "❌ Objects are not same!");

        // 9️⃣ Verify two different objects
        Assert.assertNotSame("Admin", "User", "❌ Both references are same, but expected different!");

        System.out.println("✅ All critical verifications passed successfully!");
    }
}