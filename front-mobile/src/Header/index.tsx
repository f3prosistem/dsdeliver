import { useNavigation } from "@react-navigation/native";
import React from "react";
import { StyleSheet, Text, View, Image, TouchableNativeFeedback } from "react-native";

function Header() {

  const navigation = useNavigation();

const handleOnPress = ()=>{
  navigation.navigate('Home');


}

  
  return (
    <>
  <TouchableNativeFeedback onPress={handleOnPress}>
      <View style={styles.container}>
      <Image source={require("../assets/logo.png")} />
      <Text style={styles.text}>Ds Delivery</Text>
    </View>
    </TouchableNativeFeedback>
    </>
  );
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: "#DA5C5C",
    height: 90,
    paddingTop: 50,
    flexDirection: "row",
    justifyContent: "center",
  },
  text: {
      fontWeight: 'bold',
      fontSize: 18,
      lineHeight:25,
      letterSpacing: -0.24,
      color: '#FFF',
      marginLeft:15,
      fontFamily: 'OpenSans_700Bold'
  },
});

export default Header;
