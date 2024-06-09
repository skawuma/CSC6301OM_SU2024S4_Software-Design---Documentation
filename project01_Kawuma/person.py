class MyClass:
    """
    This is a simple class that represents a person.
    """

    def __init__(self, name, age):
        """
        Constructor for MyClass.

        :param name: A string representing the person's name.
        :param age: An integer representing the person's age.
        """
        self.name = name
        self.age = age

    def get_name(self):
        """
        Get the person's name.

        :return: A string representing the person's name.
        """
        return self.name

    def set_name(self, name):
        """
        Set the person's name.

        :param name: A string representing the person's name.
        """
        self.name = name

    def get_age(self):
        """
        Get the person's age.

        :return: An integer representing the person's age.
        """
        return self.age

    def set_age(self, age):
        """
        Set the person's age.

        :param age: An integer representing the person's age.
        """
        self.age = age
def get_docs(self):
        return
print(MyClass.__doc__)
print(MyClass.get_age.__doc__)
print(MyClass.get_name.__doc__)
print(MyClass.set_age.__doc__)
print(MyClass.set_name.__doc__)

print(get_docs)

