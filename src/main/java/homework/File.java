package homework;

class File implements Component {
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Файл: " + name);
    }

    public String getName() {
        return name;
    }
}
