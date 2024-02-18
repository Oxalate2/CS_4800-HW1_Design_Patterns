package Composition;

public class Main {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1");
        Folder source_files = new Folder("Source Files");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder bem = new Folder("Bemodels");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder public_folder = new Folder("Public");
        Folder app = new Folder("app");

        php_demo1.addFolder(source_files);
        php_demo1.addFolder(config);
        php_demo1.addFolder(controllers);
        php_demo1.addFolder(library);
        php_demo1.addFolder(migrations);
        php_demo1.addFolder(bem);
        php_demo1.addFolder(views);
        php_demo1.addFolder(cache);
        php_demo1.addFolder(public_folder);

        source_files.addFolder(config);
        source_files.addFolder(controllers);
        source_files.addFolder(library);
        source_files.addFolder(migrations);
        source_files.addFolder(bem);
        source_files.addFile(new File("index.html"));

        config.addFile(new File(".htaccess"));
        config.addFile(new File(".htrouter.php"));

        public_folder.addFolder(app);

        System.out.println("Printing initial structure:");
        php_demo1.printFolderContents();

        public_folder.deleteFolder("app");
        System.out.println("\nPrinting structure after deleting 'app' folder:");
        php_demo1.printFolderContents();

        public_folder.deleteFolder("Public");
        System.out.println("\nPrinting structure after deleting 'Public' folder:");
        php_demo1.printFolderContents();
    }
}
