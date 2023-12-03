from starship import SpaceShip


class Warship(SpaceShip):
    def __init__(self, brand, material, warp_speed, capacity, status_engine, weapon_power, shield_strength, missile_count):
        # Викликаємо конструктор батьківського класу SpaceShip
        super().__init__(brand, material, warp_speed, capacity, status_engine)
        self._weapon_power = weapon_power
        self._shield_strength = shield_strength
        self._missile_count = missile_count

    # Додані методи для отримання значень щита та кількості ракет
    def get_shield_strength(self):
        return self._shield_strength

    def get_missile_count(self):
        return self._missile_count

    # Додані методи для встановлення значень щита та кількості ракет
    def set_shield_strength(self, shield_strength):
        self._shield_strength = shield_strength

    def set_missile_count(self, missile_count):
        self._missile_count = missile_count

        # Доданий метод для отримання потужності зброї

    def get_weapon_power(self):
        return self._weapon_power

        # Доданий метод для встановлення потужності зброї

    def set_weapon_power(self, weapon_power):
        self._weapon_power = weapon_power

    # Перевизначений метод для виведення інформації про військовий корабель
    def get_info(self):
        # Викликаємо метод батьківського класу для отримання загальної інформації
        super().get_info()
        print("Weapon Power:", self._weapon_power)
        print("Shield Strength:", self._shield_strength)
        print("Missile Count:", self._missile_count)
