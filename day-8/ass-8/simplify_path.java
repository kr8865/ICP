public class simplify_path {
    public static String simplifyPath(String path) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String simplified = simplifyPath(path);
        System.out.println(simplified);  // Output: /c
    }
}
