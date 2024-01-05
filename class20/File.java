package class20;


public abstract class File {
    private String name;
    private int size;
    public File(String name,int size) {
        this.name = name;
        this.size = size;
    }
        public abstract void open(String name,int size);
        public  void edit (String name){
            System.out.println("you can edit ");
        }
        public  void close(){
            System.out.println(" you can close ");
        }


    }
    class JavaFile extends File{
        public JavaFile(String name, int size) {
            super(name, size);
        }


        @Override
        public void open(String name,int size) {
            System.out.println("You need notepad++");
        }


    }
    class WordFile extends File{
        public WordFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open(String name,int size) {
            System.out.println("You ned Microsoft Word");
        }


    }
    class PdfFile extends File{
        public PdfFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open(String name,int size) {
            System.out.println("You need you need .doc file");
        }

    }

