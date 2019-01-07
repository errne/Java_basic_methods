public class Printer {
    private int paperLeft;
    private int tonerLeft;

    public Printer(){
        this.paperLeft = 1000;
        this.tonerLeft = 1000;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void setPaperLeft(int paperLeft) {
        this.paperLeft = paperLeft;
    }

    public int getTonerLeft() {
        return this.tonerLeft;
    }

    public void setTonerLeft(int tonerLeft) {
        this.tonerLeft = tonerLeft;
    }

    public void print(int pages, int copies){
        int total = pages * copies;
        if (this.hasEnoughPaper(total) && this.hasEnoughToner(total) == true){
            setPaperLeft(this.paperLeft-total);
            setTonerLeft(this.tonerLeft-total);
        } else {
            System.out.println("Refill things!");
        }


    }

    public boolean hasEnoughPaper(int pagesToPrint) {
        if (this.paperLeft >= pagesToPrint) {
            return true;
        } else {
            return false;
        }
    }
    public boolean hasEnoughToner(int pagesToPrint){
        if (this.tonerLeft >= pagesToPrint){
            return true;
        } else {
            return false;
        }

    }

    public void refillPaper(){
        setPaperLeft(1000);
    }

    public void refillToner(){
        setTonerLeft(1000);
    }

}
