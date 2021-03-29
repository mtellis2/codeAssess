import argparse
import logging
from base64 import b64encode

logger = logging.getLogger(__name__)
logging.basicConfig(level=logging.INFO, format="%(levelname)s: %(message)s")


def string_encoding(input_hex_string: str):
    """
    This function converts a hex string to base64.

    :param input_hex_string: input hexadecimal string
    """
    # convert a hex string to base64
    # input_hex_string = "45766964696e74"
    base64_string = b64encode(bytes.fromhex(input_hex_string)).decode()

    # if (input_hex_string == b64decode(base64_string.encode()).hex()) is True:
    output = f"{input_hex_string} in base64 is: {base64_string}"
    logger.info(output)
    return output


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--input-hex-string",
        required=True,
        help="Input hexadecimal string to convert to base64.",
    )
    args = parser.parse_args()
    string_encoding(args.input_hex_string)
