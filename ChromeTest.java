package week1.day2;

// Superclass
class Browser {

    String browserName;
    String browserVersion;

    Browser(String browserName, String browserVersion) {
        this.browserName = browserName;
        this.browserVersion = browserVersion;
    }

    void openURL() {
        System.out.println(browserName + " is opening a URL");
    }

    void closeBrowser() {
        System.out.println(browserName + " is closing");
    }

    void navigateBack() {
        System.out.println(browserName + " is navigating back");
    }
}

// Subclass
class Chrome extends Browser {

    Chrome(String browserName, String browserVersion) {
        super(browserName, browserVersion);
    }

    void openIncognito() {
        System.out.println("Chrome is opening in Incognito mode");
    }

    void clearCache() {
        System.out.println("Chrome cache cleared");
    }
}

// Main Class
public class ChromeTest {

    // Main method
    public static void main(String[] args) {

        Chrome chrome = new Chrome("Chrome", "136.0");

        chrome.openURL();
        chrome.navigateBack();
        chrome.closeBrowser();

        chrome.openIncognito();
        chrome.clearCache();
    }
}

