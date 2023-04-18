.class Lwb/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lwb/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwb/l;

    invoke-direct {v0}, Lwb/l;-><init>()V

    sput-object v0, Lwb/l$a;->a:Lwb/l;

    return-void
.end method
