package Classes.LivingThings.Plants.Trees.Oak;

import Classes.LivingThings.Plants.HasLeaves;
import Classes.LivingThings.Plants.Trees.Tree;

public class Oak extends Tree implements HasLeaves {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Oak.class.getSimpleName()) ||
                objClass.equals(HasLeaves.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
