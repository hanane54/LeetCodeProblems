// returns the length of the last word in the given string 
// words are splitted by whitespaces
// 2ms Beats11.76% time, 42.39MB Beats6.13% memory
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // added the function trim to fix the bug in case the String has leading whitespaces
        String[] wordsArray = s.trim().split("\\s+"); // Trim trailing spaces before splitting
        if (s.length() >= 1 && s.length() <= 10000 ) {
            return wordsArray[wordsArray.length - 1].length(); // Return the length of the last word
        }
        return -1;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        // Test case 1
        String s1 = "Hello World";
        int result1 = solution.lengthOfLastWord(s1);
        System.out.println("Test Case 1 Output: " + result1); // Expected: 5

        // Test case 2
        String s2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(s2);
        System.out.println("Test Case 2 Output: " + result2); // Expected: 4

        // Test case 3
        String s3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(s3);
        System.out.println("Test Case 3 Output: " + result3); // Expected: 6

        // Additional test case
        String s4 = "uPtqXtdxXsACYJOjtGNArtcvCPc    CWbfLKmlIaYQpFAYkZfltSjNjJN              hXGotGvQqyowBJgSMzoOEFQPHlA     MsbiELwZabDcGIuOlcsfVrUVxnREkgiEIzXGQiwKkBbbGLACrYYgGdNiSunIuZDCHFZvBpQIhkNTUscfOPWKwPLEKCVZDRcQGAobojPrPGhcTkeGbCODaXyGHcUXfQiYKwvifMGqFLeDUVPfdNPMaDrLcUAwnpAzDiuCSfMPWnvlDprFfinpKuyLiUNUy              IvwSPSecxcRmdwWTpuUyUngeGnE                   MJqoSSvaKThYFMOTtiIRiRCXkhq     SjpjgUqQuEcPThDjOdwogstzuQi         BpnbSHvsEcwQgrmrBugPeOtdSZG       ychzcYTJMzGJIsAFeiGXfVkZHIC            cdoAvhVnbCSmBQMRtSGbGgmEGBl kvZpjcEUMnyQcFIdYsNSrozhNoNQAHLhSAzTLUWkwGtdFapgPldNuO     jARPmJPzHeIAAensJoNzdtkqmpd   JVRwIgsASQnyAVEljpYGXftNASJlnOEktNveBbliIAPlhDEBFgkiIT         McNDtzzMfRTXNQemEeIRVawwHOp              wmqrrLGaVxQwHazcGXRTqJLaobS                  JyohRWAVyPrwOmxJXVmLMQycTlk     hiBSfOQYiQFGpMCZrVeVACLXScLALIcoRrdGDAzYYCwoFeSuARoXzAbSxXRiMHljlPmJNHerFewlDrqrPDXeyPmhxYSRbEYTqzPyBRHpdSBJnTyKZmYGSUmVTcdwmKrjwXaLamj         biywyxFhGclBVXxkefBRMqZUFnmHafaTMarCrHpvbAoAzEmBZPCZMjrTRFZaKDMmTwhanaUACHOHwkmnn  tRBONlYtbmmixijISOTruxwiUZvSrrnykhlLNNQcMitEJTwnmzIoRC   wRZkXDSJHZwSgpVpkzTNejrdtHO       NgDBGwLTDOzVWkFkMePCJYkjzKr               LcWoeabtfeoIPncVPkMzUPGfGDd gAkBXomHPeIgXlxWYpwJFHOaOAR          vTaYoKeHUDHQmXCWQRITfkZxlhhsZcVOOGZNzElYjTzrKyrZOOTztQogXvZyUmHXkHmJrOTbceszkwFFG                   QphPavmGdtUGKRCoPFibplVKbNU     izMKSANLzisuXPGbcDqSEovYaqaZEbwUXPbtQQluaubjoadJeRDczqkedbBPKsLLoswbeUwoSABIRuZTB     BnGXhFFUuxgTaxAAHLWvYeHpesfBiJhvkEWglAtqSACjfuoKkGviDlkZCnQjLEYMzstWsICqmTzrdiRhe                  XEQwwarNBdeIIQrothGhUNghLmAIFeMtepqgJgbXbqDlyIMTleCbfAzcQTmPnsvgqKkhYuSnXbnqUvwYlvYHlKWGxtKkusAixrZPiTzIuNaDXDcdhjrSovGNhkzmzAHLHbrvQzKTtHPyGopTjdRVKtdhsxWoARMdIA        jqerQEsmFodlYQtwoGjGKrMOtqG      xfiWqqEbkvATNSpawGjcGBtfyfmbMAYlUqwfVNYBApwnoxeTDxGtYeFDQFUxpPgfnAyShjUwvvYcFQjIc          mifJHNnSDbPZoWSTBbxlVJKWZYq                  HYCGXQXECCvaylaTMInWajpRhEvtJjDxAkMsirJGqbhHddkFRCOfox                fqYCsARYWOuxCYlkgzaOkRabhYw               jEnoPcPlhgUHakfZxOsIRaeKpvbparNfDEIZgVrlYuqSHscAYseOvAnWzQhUEyQCYbZMnIEDuQHxDQCsf          iqhBgubdzxzxkeNvfypCFxjtfmg      DIPruJQGKHFftRCUqBjcLQBaBGm           GilSgMRwehMQTvLmAbzsRaSnmDg               TGzxrQxamzzFKmeSKgtOgeOyjKm                 aRjHLFtSBJDTgwVtFfxMCRPzhkr       LSTiCrdNXfqgOmAGOUpLVxihRvS             wRmjzklLaIvRgwrLEncSFTeAqqBVkFEZbrFcOInylNLJYqzUtAJcNn              HPlhxNKetuZZDNsIYXBImNnDrDc             UahphttIcCmAgwLsAvesYXtYAnKStHYmlzQtMWLuhAItWpqQZWEufL";
        int result4 = solution.lengthOfLastWord(s4);
        System.out.println("Test Case 4 Output: " + result4); // Expected: 54
    }
}
