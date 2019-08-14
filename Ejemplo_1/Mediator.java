//El "intermediario"
class Mediator {
    
    private boolean slotFull = false;
    private int number;

    public synchronized void storeMessage(int num) {
        // No hay espacio para otro mensaje
        while (slotFull == true) {
            try {
                wait();
            }
            catch (InterruptedException e ) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    public synchronized int retrieveMessage() {
        // No hay mensajes para recuperar
        while (slotFull == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = false;
        notifyAll();
        return number;
    }
}
