class base64 {
    String base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    
    public String encode (String s) {
        StringBuilder sb = new StringBuilder();
        byte[] arr = s.getBytes();
        int i = 0;
        while (i<arr.length) {
            int a = arr[i++];
            int b = -1;
            int c = -1;
            
            if (i<arr.length) b = arr[i++] & 255;
            if (i<arr.length) c = arr[i++] & 255;    
            
            int number = a << 16;
            if (b != -1) number |= b << 8;
            if (c != -1) number |= c ;
        
        
        int num1 = number >> 18;
        int num2 = (number >> 12) & 63;
        int num3 = (number >> 6) & 63;
        int num4 = (number) & 63;
        
        sb.append(base64Chars.charAt(num1));
        sb.append(base64Chars.charAt(num2));
        if (b == -1) sb.append("==");
        else if (c == -1) {
            sb.append(base64Chars.charAt(num3));
            sb.append("=");
        }
        else {
            sb.append(base64Chars.charAt(num3));
            sb.append(base64Chars.charAt(num4));
        }
    }   
    return sb.toString();

    }
}
