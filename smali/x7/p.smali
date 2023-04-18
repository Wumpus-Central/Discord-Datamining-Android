.class public interface abstract Lx7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/o;

    invoke-direct {v0}, Lx7/o;-><init>()V

    sput-object v0, Lx7/p;->a:Lx7/p;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;ZZ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lx7/m;",
            ">;"
        }
    .end annotation
.end method
