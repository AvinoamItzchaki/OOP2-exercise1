package Classes.LivingThings.Plants.Trees.Pine;

import Classes.LivingThings.Colors.IsGreen;
import Classes.LivingThings.Plants.Trees.Tree;

public class Pine extends Tree implements IsGreen {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Pine.class.getSimpleName()) ||
                objClass.equals(IsGreen.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
