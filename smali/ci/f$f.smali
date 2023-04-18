.class public interface abstract Lci/f$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:Lci/f$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lci/f$f$a;

    invoke-direct {v0}, Lci/f$f$a;-><init>()V

    sput-object v0, Lci/f$f;->a:Lci/f$f;

    return-void
.end method


# virtual methods
.method public abstract handleException(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
.end method
