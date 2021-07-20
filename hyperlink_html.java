package BOT;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class hyperlink_html {
	public static void main(String... args) {
	
	   String htmlString = "<div><h1>Simple Solution</h1><p>Convert HTML to Text</p></div>";
	   String htmlString1 = "\"<div>If you're a first time user of&nbsp;<a href=\"\"https://westernunion.helpshift.com/admin/faq/a/wu-r2-us/\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">WU.com</a>, you'll need to create a&nbsp;<a href=\"\"https://www.westernunion.com/us/en/register.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">profile</a>. If you're a first time user of the mobile app, <a href=\"\"https://www.westernunion.com/us/en/mobile-app.html\"\" target=\"\"_blank\"\">download </a>the app first, then create a profile.</div>\r\n" + 
	   		"<ol>\r\n" + 
	   		"<li>Click Send Money and select the destination.&nbsp;</li>\r\n" + 
	   		"<li>Enter the send amount and currency.</li>\r\n" + 
	   		"<li>Choose Bank account as the&nbsp;payment option.</li>\r\n" + 
	   		"</ol>\r\n" + 
	   		"<div>Note: The Bank account payment option is unavailable when sending money in person, by phone, or if sending to a mobile wallet.</div>\"";
	   String htmlString2 = "\"<div>WU accepts various credit cards.&nbsp;</div>\r\n" + 
	   		"<div>On <strong>wu.com, mobile app, and Agent locations, </strong>we accept<strong> </strong>Western Union accepts Visa&reg;, MasterCard&reg;, and Discover&reg; credit cards*.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div><strong>For Telephone Money Transfers, </strong>we accept<strong> </strong>Visa&reg; and MasterCard&reg; credit cards*.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>* Card issuer cash advance fee and associated interest charges may apply. Use a debit card to avoid these fees and charges. American Express and Discover payment cards are <em>not</em>&nbsp;accepted for Telephone money transfer.</div>\"";
	   String htmlString3 = "\"<p><strong>It's easy to send money by paying with your bank account. Here's how:</strong></p>\r\n" + 
	   		"<ol>\r\n" + 
	   		"<li>Link a bank account to your Western Union profile</li>\r\n" + 
	   		"<li>Verify your bank account</li>\r\n" + 
	   		"<li>Send money once your bank account is added</li>\r\n" + 
	   		"</ol>\r\n" + 
	   		"<p>Link your account by entering your&nbsp;<strong>account number</strong> and/or routing number.</p>\r\n" + 
	   		"<p><em>Instant Verification:</em>&nbsp;You will need to have online banking with your bank. Enter the login credentials for your bank in order to confirm ownership. Your information will be confirmed instantly, and you will be ready to send money.</p>\"";
	   String htmlString4 = "\"<div>You can buy a money order at a participating <a href=\"\"https://www.westernunion.com/us/en/agent-locator.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">Western Union Agent location</a>. Follow the steps below to find a location near you or let me know if I can help.</div>\r\n" + 
	   		"<ol>\r\n" + 
	   		"<li>\r\n" + 
	   		"<div>Visit <a href=\"\"https://www.westernunion.com/us/en/find-locations.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">Find Locations</a></div>\r\n" + 
	   		"</li>\r\n" + 
	   		"<li>\r\n" + 
	   		"<div>Enter the required location information and click the More filters option. Select the <strong>Money Order&nbsp;</strong>option.</div>\r\n" + 
	   		"</li>\r\n" + 
	   		"<li>\r\n" + 
	   		"<div>Click<strong>&nbsp;Go</strong>.</div>\r\n" + 
	   		"</li>\r\n" + 
	   		"<li>A list of Agent locations near you that sell money orders display.</li>\r\n" + 
	   		"</ol>\"";
	   String htmlString5 = "\"<div>There are various ways to pay for a money transfer. On wu.com or our mobile app</div>\r\n" + 
	   		"<div>you can pay for a money transfer in the US using a credit* or debit card, by making a bank transfer, or with&nbsp; a wire transfer. You may also start your transfer using the mobile app and pay cash at participating <a href=\"\"https://locations.westernunion.com/\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">Western Union Agent locations</a>.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div><strong>To pay In-person, </strong>visit a WU Agent location to send money using cash or, in some cases, a debit card.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div><strong>To pay using a Telephone Money Transfer, </strong>transfer money by phone, using a credit* or debit card, by calling the Telephone Money Transfer hotline at 1-800-CALL-CASH (1800-225-5227), for transfers sent within the US.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>* Card issuer cash advance fee and associated interest charges may apply. Use a debit card to avoid these fees and charges.</div>\"";
	   String htmlString6 = "\"<div>\r\n" + 
	   		"<div>To update your name on your account profile, visit WU.com or the mobile app.</div>\r\n" + 
	   		"<div>On <a href=\"\"https://www.westernunion.com/us/en/web/user/login\"\">WU.com</a>, follow these steps.</div>\r\n" + 
	   		"<div>1. Log into your WU <a href=\"\"https://www.westernunion.com/us/en/send-money/app/login\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">profile</a>.</div>\r\n" + 
	   		"<div>2. At the top of the web page, click&nbsp;your name.</div>\r\n" + 
	   		"<div>3. Click the pencil icon to the right of your address.</div>\r\n" + 
	   		"<div>4. Make your changes and click&nbsp;Save.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>On the WU Mobile app<strong><br /></strong></div>\r\n" + 
	   		"<div>1. Log on to your WU profile.</div>\r\n" + 
	   		"<div>2. Tap&nbsp;Profile.<strong><br /></strong></div>\r\n" + 
	   		"<div>3. Tap&nbsp;Edit<strong><br /></strong>4. Make your changes and tap Save.</div>\r\n" + 
	   		"</div>\"";
	   String htmlString7 = "\"<div>To send money <strong>online</strong>, you must register. To&nbsp;<a href=\"\"https://www.westernunion.com/us/en/register.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\"><u>Register</u></a>&nbsp;for a profile, you will need:</div>\r\n" + 
	   		"<ul>\r\n" + 
	   		"<li>Your complete name as it appears on your government-issued ID</li>\r\n" + 
	   		"<li>Your email address</li>\r\n" + 
	   		"<li>Your mobile number</li>\r\n" + 
	   		"<li>Your billing address</li>\r\n" + 
	   		"</ul>\r\n" + 
	   		"<div>To send I<strong>n person </strong>or a <strong>T</strong><strong>elephone Money Transfer - US to US, </strong>registration is not required.</div>\"";
	   String htmlString8 = "\"<div>You may change the email address on your WU profile.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>On&nbsp;<a href=\"\"https://www.westernunion.com/us/en/home.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">WU.com</a>, log into your account.</div>\r\n" + 
	   		"<div>1. Select <strong>your name</strong>&nbsp;in the top right corner.</div>\r\n" + 
	   		"<div>2. To the right of your email address, select the <strong>pencil icon</strong>.</div>\r\n" + 
	   		"<div>3. Make your changes, click <strong>Save,</strong>&nbsp;and confirm the changes.</div>\r\n" + 
	   		"<div>A verification email is sent to the email address you provided. It contains a PIN that is available for 72 hours. We recommend proceeding with the next steps right away.</div>\r\n" + 
	   		"<div>4. Check your email.</div>\r\n" + 
	   		"<div>5. Enter the PIN you receive in your email on the Enter your PIN page and click <strong>Continue</strong>&nbsp;to complete the change.</div>\r\n" + 
	   		"<div>&nbsp;</div>\"";
	   String htmlString9 = "\"<div>Please check the status of your Money Order by calling 1-800-999-9660. If your Money Order has not been cashed and you would like to request refund, you may complete and submit our request form by visiting our Money Order&nbsp;<a href=\"\"https://www.westernunion.com/self-service-form/rmo-form\"\" target=\"\"_blank\"\">request page.</a></div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>Before completing this web form, please read the disclaimer found at the top of the form.</div>\"";
	   String htmlString10 = "\"<div>You may send money transfers by using our mobile apps on your IOS or android mobile device.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>First, download the <a href=\"\"https://www.westernunion.com/us/en/mobile-app.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">Western Union app</a>.&nbsp;</div>\r\n" + 
	   		"<div>Second, create an account or if you're an existing customer, just login.</div>\r\n" + 
	   		"<div>Last, enter the requested information, and you may send money using a credit*/debit card or bank account.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>* Card issuer cash advance fee and associated interest charges may apply. Use a debit card to avoid these fees and charges.</div>\r\n" + 
	   		"<div>&nbsp;</div>\r\n" + 
	   		"<div>You can also access&nbsp;<a href=\"\"https://www.westernunion.com/us/en/home.html\"\" target=\"\"_blank\"\" rel=\"\"nofollow noopener\"\">westernunion.com</a>&nbsp;from any web browser on your mobile device.</div>\r\n" + 
	   		"<div>&nbsp;</div>\"";
	   
	   
	   
	   
       String outputText = Jsoup.clean(htmlString, new Whitelist());
       String outputText1 = Jsoup.clean(htmlString1, new Whitelist());
       String outputText2 = Jsoup.clean(htmlString2, new Whitelist());
       String outputText3 = Jsoup.clean(htmlString3, new Whitelist());
       String outputText4 = Jsoup.clean(htmlString4, new Whitelist());
       String outputText5 = Jsoup.clean(htmlString5, new Whitelist());
       String outputText6 = Jsoup.clean(htmlString6, new Whitelist());
       String outputText7 = Jsoup.clean(htmlString7, new Whitelist());
       String outputText8 = Jsoup.clean(htmlString8, new Whitelist());
       String outputText9 = Jsoup.clean(htmlString9, new Whitelist());
       String outputText10 = Jsoup.clean(htmlString10, new Whitelist());
////       String outputText = Jsoup.clean(htmlString, new Whitelist());
       
       System.out.println(outputText);
       System.out.println(outputText1);
       System.out.println(outputText2);
       System.out.println(outputText3);
       System.out.println(outputText4);
       System.out.println(outputText5);
       System.out.println(outputText6);
       System.out.println(outputText7);
       System.out.println(outputText8);
       System.out.println(outputText9);
       System.out.println(outputText10);
   }
}


