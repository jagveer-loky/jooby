package io.jooby.exception;

import io.jooby.StatusCode;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Whether a HTTP method isn't supported. The {@link #getAllow()} contains the supported
 * HTTP methods.
 *
 * @since 2.4.1
 * @author edgar
 */
public class MethodNotAllowedException extends StatusCodeException {
  private final List<String> allow;

  /**
   * Creates a new method not allowed exception.
   *
   * @param method Requested method.
   * @param allow Allow methods.
   */
  public MethodNotAllowedException(@Nonnull String method, @Nonnull List<String> allow) {
    super(StatusCode.METHOD_NOT_ALLOWED, method);
    this.allow = allow;
  }

  /**
   * Requested method.
   *
   * @return Requested method.
   */
  public String getMethod() {
    return getMessage();
  }

  /**
   * Allow methods.
   *
   * @return Allow methods.
   */
  public List<String> getAllow() {
    return allow;
  }
}
