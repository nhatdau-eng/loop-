package SecurityScannerOptimized;
public class SecurityScanner {
    public static void main(String[] args) {
        String[] users = {"USER_01", null, "BANNED_01", "USER_02", "ADMIN_01", "USER_03", "USER_04"};
        int[] loginAttempts = {1, 0, 8, 4, 0, 5, 2};
        boolean[] isLocked = {false, false, true, false, false, false, false};

        System.out.println("--- BẮT ĐẦU QUÉT HỆ THỐNG ---");
        long startTime = System.nanoTime();

        for (int i = 0; i < users.length; i++) {
            
            if (users[i] == null 
                ||users[i].startsWith("BANNED")
                 || isLocked[i]){
                    continue ;
                 }

                        if (loginAttempts[i] > 3) {
                            System.out.println("Cảnh báo: " + users[i] + " sai mật khẩu " + loginAttempts[i] + " lần.");
                        }

                if (users[i].startsWith("ADMIN")) {
                    System.out.println("Đã tìm thấy Admin hệ thống: " + users[i]);
                    break ; 
                }
            }
        long endTime = System.nanoTime();
        System.out.println("Thời gian quét: " + (endTime - startTime) + " nano giây.");
        
    }
}