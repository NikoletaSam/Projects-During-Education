package barracksWars.core.factories;

import barracksWars.data.UnitRepository;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.models.units.Archer;
import com.sun.source.doctree.UnknownInlineTagTree;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// TODO: implement for problem 3
			String unitTypeName = unitType.substring(0, 1).toUpperCase() + unitType.substring(1);
			Class newUnit = Class.forName(UNITS_PACKAGE_NAME + unitTypeName);
			Unit myUnit = (Unit) newUnit.getDeclaredConstructor().newInstance();

		return myUnit;
		//throw new ExecutionControl.NotImplementedException("message");
	}
}
