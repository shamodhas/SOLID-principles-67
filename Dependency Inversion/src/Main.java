/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 2/3/2025 10:44 AM
 * Project: SOLID
 * --------------------------------------------
 **/

// Entities must depend on abstractions, not on
// concretions. It states that the high-level module
// must not depend on the low-level module, but they
// should depend on abstractions.

// high-level module - UI, Business Logic
// low-level module - database call function, authentication functions

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClassImpl();
    }
}

interface SubClass{

}

class SubClassImpl implements SubClass{
}






