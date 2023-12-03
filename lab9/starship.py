class SpaceShip:
    def __init__(self, brand, material, warp_speed, capacity, status_engine):
        self._brand = brand
        self._material = material
        self._warp_speed = warp_speed
        self._capacity = capacity
        self._status_engine = status_engine

    # Getter methods
    def get_brand(self):
        return self._brand

    def get_material(self):
        return self._material

    def get_warp_speed(self):
        return self._warp_speed

    def get_capacity(self):
        return self._capacity

    def is_engine_running(self):
        return self._status_engine

    # Setter methods
    def set_brand(self, brand):
        self._brand = brand

    def set_material(self, material):
        self._material = material

    def set_warp_speed(self, warp_speed):
        self._warp_speed = warp_speed

    def set_capacity(self, capacity):
        self._capacity = capacity

    def set_engine_status(self, status_engine):
        self._status_engine = status_engine

    # Method to get information about the spaceship
    def get_info(self):
        print("Brand:", self._brand)
        print("Material:", self._material)
        print("Warp Speed:", self._warp_speed)
        print("Capacity:", self._capacity)
        print("Engine Status:", "Running" if self._status_engine else "Not Running")
