//165
//Compare Two Version Numbers

//Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'
//. The value of the revision is its integer conversion ignoring leading zeros.
//To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions,
// treat the missing revision values as 0.

class CompareVersionStrings {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int n = Math.max(v1.length, v2.length);

        for (int i = 0; i < n; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 > num2) return 1;
            if (num1 < num2) return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        CompareVersionStrings sol = new CompareVersionStrings();

        System.out.println(sol.compareVersion("1.01", "1.001"));  
        System.out.println(sol.compareVersion("1.0", "1.0.0"));   
        System.out.println(sol.compareVersion("0.1", "1.1"));     
        System.out.println(sol.compareVersion("1.2", "1.10"));    
        System.out.println(sol.compareVersion("2.0", "1.9.9"));   
    }
}
