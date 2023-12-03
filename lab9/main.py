from warship import SpaceShip, Warship

if __name__ == "__main__":
    # Створення об'єкта SpaceShip
    my_space_ship = SpaceShip(brand="Galactica", material="Titanium", warp_speed=7, capacity=1000, status_engine=True)
    # Виведення інформації про корабель
    print("=== Initial Information ===")
    my_space_ship.get_info()
    print("===========================")

    # Зміна деяких параметрів
    my_space_ship.set_brand("Voyager")
    my_space_ship.set_warp_speed(9)
    my_space_ship.set_engine_status(False)

    # Виведення оновленої інформації про корабель
    print("\n=== Updated Information ===")
    my_space_ship.get_info()
    print("===========================")
    # Створення об'єкта Warship
    my_warship = Warship(brand="Dreadnought", material="Adamantium", warp_speed=5, capacity=1500, status_engine=True,
                         weapon_power=500, shield_strength=1000, missile_count=20)

    # Виведення інформації про військовий корабель
    print("=== Warship Information ===")
    my_warship.get_info()
    print("============================")

    # Зміна деяких параметрів
    my_warship.set_warp_speed(7)
    my_warship.set_weapon_power(800)
    my_warship.set_shield_strength(1200)
    my_warship.set_missile_count(25)

    # Виведення оновленої інформації про військовий корабель
    print("\n=== Updated Warship Information ===")
    my_warship.get_info()
    print("===============================")
